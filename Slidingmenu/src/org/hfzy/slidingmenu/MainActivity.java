package org.hfzy.slidingmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends Activity {

	private SlidingMenu menu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
		menu = new SlidingMenu(this);
		 //���ò˵�ģʽ��LEFT(��������) RIGHT(���Ҳ����) 
		//LEFT_RIGHT(���Ҳ����)
        menu.setMode(SlidingMenu.LEFT_RIGHT);
        //����ģʽ
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
		 //����ƫ�����
		menu.setBehindOffset(200);
		menu.setFadeDegree(0.5f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		//�����������Ҳ����ļ�
		menu.setMenu(R.layout.left_layout);
		menu.setSecondaryMenu(R.layout.right_layout);
		ImageButton ibMenu = (ImageButton) findViewById(R.id.ib_menu);
		//����¼�
		ibMenu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//��߲���
				//menu.toggle();
				//��ʾ�ұߵĲ���
				menu.showSecondaryMenu();
			}
		});
		
	}


}
