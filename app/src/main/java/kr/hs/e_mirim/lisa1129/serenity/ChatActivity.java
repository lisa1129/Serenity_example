package kr.hs.e_mirim.lisa1129.serenity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {
    BitmapDrawable bitmap;
    ImageView imageView;
    int imagepoint=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        imageView = (ImageView)findViewById(R.id.imageView);
        imagepoint=imagepoint+1;
        changeImage();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ActionBar actionBar = getSupportActionBar();

        // Custom Actionbar를 사용하기 위해 CustomEnabled을 true 시키고 필요 없는 것은 false 시킨다
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);            //액션바 아이콘을 업 네비게이션 형태로 표시합니다.
        actionBar.setDisplayShowTitleEnabled(false);        //액션바에 표시되는 제목의 표시유무를 설정합니다.
        actionBar.setDisplayShowHomeEnabled(false);            //홈 아이콘을 숨김처리합니다.


        //layout을 가지고 와서 actionbar에 포팅을 시킵니다.
        LayoutInflater inflater1 = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View actionbar = inflater1.inflate(R.layout.custom_bar, null);

        actionBar.setCustomView(actionbar);

        //액션바 양쪽 공백 없애기
        Toolbar parent = (Toolbar) actionbar.getParent();
        parent.setContentInsetsAbsolute(0, 0);

        return true;
    }


    public void airplaneonClicked(View v) {
        Toast.makeText(this, "이미 글귀 화면 입니다.", Toast.LENGTH_SHORT).show();


    }
    public void corssbuttononClicked(View v) {


        Intent intent = new Intent(getApplicationContext(), MainActivity.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);
        overridePendingTransition(0, 0);

    }

    private void changeImage(){
        Resources res = getResources();

        /*if (imagepoint>365) {imagepoint=1;}

        if (imagepoint==1) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam1);}
        if (imagepoint==2) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam2);}
        if (imagepoint==3) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam3);}
        if (imagepoint==4) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam4);}
        if (imagepoint==5) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam5);}
        if (imagepoint==6) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam6);}
        if (imagepoint==7) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam7);}
        if (imagepoint==8) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam8);}
        if (imagepoint==9) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam9);}
        if (imagepoint==10) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam10);}
        if (imagepoint==11) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam11);}
        if (imagepoint==12) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam12);}
        if (imagepoint==13) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam13);}
        if (imagepoint==14) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam14);}
        if (imagepoint==15) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam15);}
        if (imagepoint==16) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam16);}
        if (imagepoint==17) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam17);}
        if (imagepoint==18) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam18);}
        if (imagepoint==19) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam19);}
        if (imagepoint==20) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam20);}
        if (imagepoint==21) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam21);}
        if (imagepoint==22) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam22);}
        if (imagepoint==23) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam23);}
        if (imagepoint==24) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam24);}
        if (imagepoint==25) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam25);}
        if (imagepoint==26) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam26);}
        if (imagepoint==27) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam27);}
        if (imagepoint==28) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam28);}
        if (imagepoint==29) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam29);}
        if (imagepoint==30) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam30);}
        if (imagepoint==31) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam31);}
        if (imagepoint==32) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam32);}
        if (imagepoint==33) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam33);}
        if (imagepoint==34) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam34);}
        if (imagepoint==35) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam35);}
        if (imagepoint==36) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam36);}
        if (imagepoint==37) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam37);}
        if (imagepoint==38) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam38);}
        if (imagepoint==39) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam39);}
        if (imagepoint==40) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam40);}
        if (imagepoint==41) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam41);}
        if (imagepoint==42) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam42);}
        if (imagepoint==43) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam43);}
        if (imagepoint==44) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam44);}
        if (imagepoint==45) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam45);}
        if (imagepoint==46) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam46);}
        if (imagepoint==47) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam47);}
        if (imagepoint==48) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam48);}
        if (imagepoint==49) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam49);}
        if (imagepoint==50) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam50);}
        if (imagepoint==51) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam51);}
        if (imagepoint==52) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam52);}
        if (imagepoint==53) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam53);}
        if (imagepoint==54) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam54);}
        if (imagepoint==55) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam55);}
        if (imagepoint==56) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam56);}
        if (imagepoint==57) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam57);}
        if (imagepoint==58) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam58);}
        if (imagepoint==59) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam59);}
        if (imagepoint==60) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam60);}
        if (imagepoint==61) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam61);}
        if (imagepoint==62) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam62);}
        if (imagepoint==63) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam63);}
        if (imagepoint==64) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam64);}
        if (imagepoint==65) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam65);}
        if (imagepoint==66) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam66);}
        if (imagepoint==67) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam67);}
        if (imagepoint==68) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam68);}
        if (imagepoint==69) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam69);}
        if (imagepoint==70) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam70);}
        if (imagepoint==71) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam71);}
        if (imagepoint==72) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam72);}
        if (imagepoint==73) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam73);}
        if (imagepoint==74) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam74);}
        if (imagepoint==75) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam75);}
        if (imagepoint==76) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam76);}
        if (imagepoint==77) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam77);}
        if (imagepoint==78) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam78);}
        if (imagepoint==79) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam79);}
        if (imagepoint==80) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam80);}
        if (imagepoint==81) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam81);}
        if (imagepoint==82) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam82);}
        if (imagepoint==83) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam83);}
        if (imagepoint==84) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam84);}
        if (imagepoint==85) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam85);}
        if (imagepoint==86) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam86);}
        if (imagepoint==87) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam87);}
        if (imagepoint==88) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam88);}
        if (imagepoint==89) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam89);}
        if (imagepoint==90) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam90);}
        if (imagepoint==91) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam91);}
        if (imagepoint==92) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam92);}
        if (imagepoint==93) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam93);}
        if (imagepoint==94) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam94);}
        if (imagepoint==95) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam95);}
        if (imagepoint==96) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam96);}
        if (imagepoint==97) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam97);}
        if (imagepoint==98) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam98);}
        if (imagepoint==99) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam99);}
        if (imagepoint==100) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam100);}
        if (imagepoint==101) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam101);}
        if (imagepoint==102) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam102);}
        if (imagepoint==103) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam103);}
        if (imagepoint==104) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam104);}
        if (imagepoint==105) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam105);}
        if (imagepoint==106) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam106);}
        if (imagepoint==107) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam107);}
        if (imagepoint==108) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam108);}
        if (imagepoint==109) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam109);}
        if (imagepoint==110) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam110);}
        if (imagepoint==111) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam111);}
        if (imagepoint==112) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam112);}
        if (imagepoint==113) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam113);}
        if (imagepoint==114) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam114);}
        if (imagepoint==115) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam115);}
        if (imagepoint==116) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam116);}
        if (imagepoint==117) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam117);}
        if (imagepoint==118) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam118);}
        if (imagepoint==119) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam119);}
        if (imagepoint==120) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam120);}
        if (imagepoint==121) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam121);}
        if (imagepoint==122) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam122);}
        if (imagepoint==123) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam123);}
        if (imagepoint==124) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam124);}
        if (imagepoint==125) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam125);}
        if (imagepoint==126) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam126);}
        if (imagepoint==127) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam127);}
        if (imagepoint==128) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam128);}
        if (imagepoint==129) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam129);}
        if (imagepoint==130) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam130);}
        if (imagepoint==131) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam131);}
        if (imagepoint==132) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam132);}
        if (imagepoint==133) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam133);}
        if (imagepoint==134) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam134);}
        if (imagepoint==135) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam135);}
        if (imagepoint==136) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam136);}
        if (imagepoint==137) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam137);}
        if (imagepoint==138) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam138);}
        if (imagepoint==139) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam139);}
        if (imagepoint==140) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam140);}
        if (imagepoint==141) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam141);}
        if (imagepoint==142) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam142);}
        if (imagepoint==143) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam143);}
        if (imagepoint==144) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam144);}
        if (imagepoint==145) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam145);}
        if (imagepoint==146) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam146);}
        if (imagepoint==147) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam147);}
        if (imagepoint==148) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam148);}
        if (imagepoint==149) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam149);}
        if (imagepoint==150) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam150);}
        if (imagepoint==151) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam151);}
        if (imagepoint==152) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam152);}
        if (imagepoint==153) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam153);}
        if (imagepoint==154) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam154);}
        if (imagepoint==155) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam155);}
        if (imagepoint==156) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam156);}
        if (imagepoint==157) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam157);}
        if (imagepoint==158) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam158);}
        if (imagepoint==159) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam159);}
        if (imagepoint==160) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam160);}
        if (imagepoint==161) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam161);}
        if (imagepoint==162) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam162);}
        if (imagepoint==163) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam163);}
        if (imagepoint==164) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam164);}
        if (imagepoint==165) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam165);}
        if (imagepoint==166) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam166);}
        if (imagepoint==167) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam167);}
        if (imagepoint==168) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam168);}
        if (imagepoint==169) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam169);}
        if (imagepoint==170) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam170);}
        if (imagepoint==171) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam171);}
        if (imagepoint==172) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam172);}
        if (imagepoint==173) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam173);}
        if (imagepoint==174) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam174);}
        if (imagepoint==175) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam175);}
        if (imagepoint==176) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam176);}
        if (imagepoint==177) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam177);}
        if (imagepoint==178) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam178);}
        if (imagepoint==179) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam179);}
        if (imagepoint==180) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam180);}
        if (imagepoint==181) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam181);}
        if (imagepoint==182) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam182);}
        if (imagepoint==183) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam183);}
        if (imagepoint==184) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam184);}
        if (imagepoint==185) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam185);}
        if (imagepoint==186) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam186);}
        if (imagepoint==187) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam187);}
        if (imagepoint==188) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam188);}
        if (imagepoint==189) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam189);}
        if (imagepoint==190) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam190);}
        if (imagepoint==191) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam191);}
        if (imagepoint==192) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam192);}
        if (imagepoint==193) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam193);}
        if (imagepoint==194) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam194);}
        if (imagepoint==195) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam195);}
        if (imagepoint==196) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam196);}
        if (imagepoint==197) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam197);}
        if (imagepoint==198) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam198);}
        if (imagepoint==199) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam199);}
        if (imagepoint==200) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam200);}
        if (imagepoint==201) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam201);}
        if (imagepoint==202) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam202);}
        if (imagepoint==203) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam203);}
        if (imagepoint==204) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam204);}
        if (imagepoint==205) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam205);}
        if (imagepoint==206) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam206);}
        if (imagepoint==207) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam207);}
        if (imagepoint==208) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam208);}
        if (imagepoint==209) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam209);}
        if (imagepoint==210) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam210);}
        if (imagepoint==211) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam211);}
        if (imagepoint==212) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam212);}
        if (imagepoint==213) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam213);}
        if (imagepoint==214) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam214);}
        if (imagepoint==215) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam215);}
        if (imagepoint==216) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam216);}
        if (imagepoint==217) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam217);}
        if (imagepoint==218) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam218);}
        if (imagepoint==219) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam219);}
        if (imagepoint==220) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam220);}
        if (imagepoint==221) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam221);}
        if (imagepoint==222) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam222);}
        if (imagepoint==223) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam223);}
        if (imagepoint==224) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam224);}
        if (imagepoint==225) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam225);}
        if (imagepoint==226) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam226);}
        if (imagepoint==227) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam227);}
        if (imagepoint==228) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam228);}
        if (imagepoint==229) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam229);}
        if (imagepoint==230) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam230);}
        if (imagepoint==231) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam231);}
        if (imagepoint==232) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam232);}
        if (imagepoint==233) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam233);}
        if (imagepoint==234) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam234);}
        if (imagepoint==235) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam235);}
        if (imagepoint==236) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam236);}
        if (imagepoint==237) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam237);}
        if (imagepoint==238) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam238);}
        if (imagepoint==239) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam239);}
        if (imagepoint==240) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam240);}
        if (imagepoint==241) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam241);}
        if (imagepoint==242) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam242);}
        if (imagepoint==243) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam243);}
        if (imagepoint==244) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam244);}
        if (imagepoint==245) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam245);}
        if (imagepoint==246) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam246);}
        if (imagepoint==247) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam247);}
        if (imagepoint==248) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam248);}
        if (imagepoint==249) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam249);}
        if (imagepoint==250) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam250);}
        if (imagepoint==251) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam251);}
        if (imagepoint==252) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam252);}
        if (imagepoint==253) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam253);}
        if (imagepoint==254) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam254);}
        if (imagepoint==255) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam255);}
        if (imagepoint==256) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam256);}
        if (imagepoint==257) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam257);}
        if (imagepoint==258) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam258);}
        if (imagepoint==259) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam259);}
        if (imagepoint==260) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam260);}
        if (imagepoint==261) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam261);}
        if (imagepoint==262) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam262);}
        if (imagepoint==263) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam263);}
        if (imagepoint==264) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam264);}
        if (imagepoint==265) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam265);}
        if (imagepoint==266) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam266);}
        if (imagepoint==267) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam267);}
        if (imagepoint==268) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam268);}
        if (imagepoint==269) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam269);}
        if (imagepoint==270) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam270);}
        if (imagepoint==271) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam271);}
        if (imagepoint==272) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam272);}
        if (imagepoint==273) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam273);}
        if (imagepoint==274) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam274);}
        if (imagepoint==275) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam275);}
        if (imagepoint==276) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam276);}
        if (imagepoint==277) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam277);}
        if (imagepoint==278) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam278);}
        if (imagepoint==279) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam279);}
        if (imagepoint==280) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam280);}
        if (imagepoint==281) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam281);}
        if (imagepoint==282) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam282);}
        if (imagepoint==283) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam283);}
        if (imagepoint==284) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam284);}
        if (imagepoint==285) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam285);}
        if (imagepoint==286) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam286);}
        if (imagepoint==287) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam287);}
        if (imagepoint==288) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam288);}
        if (imagepoint==289) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam289);}
        if (imagepoint==290) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam290);}
        if (imagepoint==291) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam291);}
        if (imagepoint==292) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam292);}
        if (imagepoint==293) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam293);}
        if (imagepoint==294) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam294);}
        if (imagepoint==295) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam295);}
        if (imagepoint==296) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam296);}
        if (imagepoint==297) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam297);}
        if (imagepoint==298) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam298);}
        if (imagepoint==299) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam299);}
        if (imagepoint==300) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam300);}
        if (imagepoint==301) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam301);}
        if (imagepoint==302) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam302);}
        if (imagepoint==303) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam303);}
        if (imagepoint==304) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam304);}
        if (imagepoint==305) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam305);}
        if (imagepoint==306) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam306);}
        if (imagepoint==307) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam307);}
        if (imagepoint==308) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam308);}
        if (imagepoint==309) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam309);}
        if (imagepoint==310) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam310);}
        if (imagepoint==311) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam311);}
        if (imagepoint==312) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam312);}
        if (imagepoint==313) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam313);}
        if (imagepoint==314) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam314);}
        if (imagepoint==315) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam315);}
        if (imagepoint==316) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam316);}
        if (imagepoint==317) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam317);}
        if (imagepoint==318) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam318);}
        if (imagepoint==319) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam319);}
        if (imagepoint==320) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam320);}
        if (imagepoint==321) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam321);}
        if (imagepoint==322) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam322);}
        if (imagepoint==323) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam323);}
        if (imagepoint==324) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam324);}
        if (imagepoint==325) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam325);}
        if (imagepoint==326) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam326);}
        if (imagepoint==327) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam327);}
        if (imagepoint==328) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam328);}
        if (imagepoint==329) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam329);}
        if (imagepoint==330) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam330);}
        if (imagepoint==331) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam331);}
        if (imagepoint==332) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam332);}
        if (imagepoint==333) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam333);}
        if (imagepoint==334) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam334);}
        if (imagepoint==335) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam335);}
        if (imagepoint==336) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam336);}
        if (imagepoint==337) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam337);}
        if (imagepoint==338) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam338);}
        if (imagepoint==339) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam339);}
        if (imagepoint==340) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam340);}
        if (imagepoint==341) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam341);}
        if (imagepoint==342) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam342);}
        if (imagepoint==343) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam343);}
        if (imagepoint==344) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam344);}
        if (imagepoint==345) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam345);}
        if (imagepoint==346) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam346);}
        if (imagepoint==347) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam347);}
        if (imagepoint==348) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam348);}
        if (imagepoint==349) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam349);}
        if (imagepoint==350) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam350);}
        if (imagepoint==351) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam351);}
        if (imagepoint==352) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam352);}
        if (imagepoint==353) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam353);}
        if (imagepoint==354) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam354);}
        if (imagepoint==355) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam355);}
        if (imagepoint==356) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam356);}
        if (imagepoint==357) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam357);}
        if (imagepoint==358) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam358);}
        if (imagepoint==359) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam359);}
        if (imagepoint==360) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam360);}
        if (imagepoint==361) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam361);}
        if (imagepoint==362) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam362);}
        if (imagepoint==363) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam363);}
        if (imagepoint==364) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam364);}
        if (imagepoint==365) {bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam365);}*/



        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.gam1);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);



    }

}
