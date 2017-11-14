package kr.hs.e_mirim.lisa1129.serenity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class MypageActivity extends AppCompatActivity {

    private static final int PICK_FROM_GALLERY = 7;
    private static final int CROP_FROM_CAMERA = 19;
    Uri mImageCaptureUri;
    ImageView profile_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        profile_img = (ImageView)findViewById(R.id.profile_img);

        ImageButton home = (ImageButton)findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);

            }
        });

        ImageButton mypage = (ImageButton)findViewById(R.id.mypageButton);
        mypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent);

            }
        });

        ImageButton editpencil = (ImageButton)findViewById(R.id.editpencil);
        editpencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType(MediaStore.Images.Media.CONTENT_TYPE);
                startActivityForResult(intent, PICK_FROM_GALLERY);
            }
        });
    }

//    private void getPhotoFromGallery(){
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode != RESULT_OK)
            return;

        switch (requestCode){
            case PICK_FROM_GALLERY:{
                mImageCaptureUri = data.getData();
                Log.i("NR",mImageCaptureUri.getPath().toString());

                Intent intent = new Intent("com.android.camera.action.CROP");
                intent.setDataAndType(mImageCaptureUri, "image/*");

                intent.putExtra("outputX", 100);
                intent.putExtra("outputY",100);
                intent.putExtra("aspectX",1);
                intent.putExtra("aspectY",1);

                intent.putExtra("scale",true);
                intent.putExtra("return-data",true);

//                startActivityForResult(intent,CROP_FROM_CAMERA);

            }

//            case CROP_FROM_CAMERA{
//                final Bundle extras = data.getExtras();
//
//                String filePatch = Environment.getExternalStorageDirectory().getAbsolutePath() + "/temp/"+System.currentTimeMillis()+".jpg";
//
//                if(extras != null){
//                    Bitmap photo = extras.getParcelable("data"); //crop 된 bitmap
//                    storeCropImage(photo,filePatch);
//                    sendBroadcast(new Intent(Intent.ACTION_MEDIA_MOUNTED, Uri.parse("file://"+Environment.getExternalStorageDirectory())));
//                }
//
//                File file = new File(mImageCaptureUri.getPath());
//                if(file.exists()){
//                    file.delete();
//                }
//            }
        }
    }

    private void storeCropImage(Bitmap bitmap, String filePath){
        File copyFile = new File(filePath);
        BufferedOutputStream out = null;

        try{
            copyFile.createNewFile();
            out=new BufferedOutputStream((new FileOutputStream(copyFile)));
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,out);
            out.flush();
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

//    private void photoPickClick (View v) {
//        // TODO Auto-generated method stub
//        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        startActivityForResult(cameraIntent,1);
//    };
//
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//// TODO Auto-generated method stub
//        super.onActivityResult(requestCode, resultCode, data);
//        if(resultCode!=0){
//            if(requestCode==1&&!data.equals(null)){
//                try{
//                    profileBitmap = (Bitmap)data.getExtras().get("data");
//                    profileView.setImageBitmap(profileBitmap);
//                    profileView.setScaleType(ImageView.ScaleType.FIT_XY);
//                } catch(Exception e){
//                    return;
//                }
//            }
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ActionBar actionBar = getSupportActionBar();

        // Custom Actionbar를 사용하기 위해 CustomEnabled을 true 시키고 필요 없는 것은 false 시킨다
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);            //액션바 아이콘을 업 네비게이션 형태로 표시합니다.
        actionBar.setDisplayShowTitleEnabled(false);        //액션바에 표시되는 제목의 표시유무를 설정합니다.
        actionBar.setDisplayShowHomeEnabled(false);            //홈 아이콘을 숨김처리합니다.


        //layout을 가지고 와서 actionbar에 포팅을 시킵니다.
        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View actionbar = inflater.inflate(R.layout.custom_bar, null);

        actionBar.setCustomView(actionbar);

        //액션바 양쪽 공백 없애기
        Toolbar parent = (Toolbar)actionbar.getParent();
        parent.setContentInsetsAbsolute(0,0);

        return true;
    }
    public void airplaneonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), ChatActivity.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
        overridePendingTransition(0, 0);

    }
}
