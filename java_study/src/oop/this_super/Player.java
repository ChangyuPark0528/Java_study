package oop.this_super;

public class Player {
	
	String name;
	int level;
	int hp;
	int atk;
	
	Player(){
		name = "무명";
		level = 1;
		hp = 20;
		atk = 50;
	}
	
	Player(String name){
		this();
		this.name = name;
	}
	
	Player(String na, int hp){
		this(na);
		this.hp = hp;
	}
	
	Player(String na, int hp, int lv){
		this(na,hp);
		this.level = lv;
	}
	
	void show() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("닉네임: " + name);
		System.out.println("레벨Lv: " + level);
		System.out.println("체력: " + hp);
		System.out.println("공력력: " + atk);
	}

}
