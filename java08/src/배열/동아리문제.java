package 배열;

import java.util.Scanner;

public class 동아리문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("동아리 명단의 이번학기 성적입니다.");
		System.out.println();
		
		String[] name = {"김아무개","박아무개","송아무개","정아무개","장아무개"};
		int[] grade = {1,2,3,1,1};
		char[] score = {'A','B','C','A','B'};
		
		System.out.println("이름         학년          학점");
		System.out.println("----------------------------------");
		System.out.println(name[0]+"     "+grade[0]+"             "+score[0]);
		System.out.println(name[1]+"     "+grade[1]+"             "+score[1]);
		System.out.println(name[2]+"     "+grade[2]+"             "+score[2]);
		System.out.println(name[3]+"     "+grade[3]+"             "+score[3]);
		System.out.println(name[4]+"     "+grade[4]+"             "+score[4]);
		
		System.out.println();
		
		System.out.println("1.  전체인원은?  " + name.length + "명");
		
		System.out.print("2.  전체 명단 프린트 ?" + "  ");
		for (String i : name) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		System.out.println("3.  학년별 인원수, 학점별 인원수!"+"  ");
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		
		for (int i = 0; i < grade.length; i++) {
			if(grade[i]==1) {
				one ++;
			}else if(grade[i] == 2){
				two ++;
			}else if(grade[i]==3) {
				three ++;
			}else if(grade[i]==4) {
				four ++;
			}
		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		for (int i = 0; i < score.length; i++) {
			if(score[i]=='A') {
				a ++;
			}else if(score[i] == 'B'){
				b ++;
			}else if(score[i]=='C') {
				c ++;
			}else if(score[i]=='D') {
				d ++;
			}else if(score[i]=='F') {
				f ++;
			}
		}
		System.out.println("1학년 : " + one +"명 ");
		System.out.println("2학년 : " + two + "명 ");
		System.out.println("3학년 : " + three + "명");
		System.out.println("4학년 : " + four+"명");
		System.out.println();
		System.out.println("A학점 : "+a +"명 ");
		System.out.println("B학점 : "+b +"명 ");
		System.out.println("C학점 : "+c +"명 ");
		System.out.println("D학점 : "+d+"명 ");
		System.out.println("F학점 : "+f+"명 ");
		
		System.out.print("4.이 동아리에 가장 많은 학년은 ? ");
		int[] gradeCount = {one,two,three,four};
		int max = gradeCount[0];
		int maxGrade = grade[0];
		for (int i = 0; i < gradeCount.length; i++) {
			if(max<gradeCount[i]) {
				gradeCount[i] = max;
			}
			for (int j = 0; j < grade.length; j++) {
				if(i==j) {
					gradeCount[i]=grade[j];
				}
			}
		}
		System.out.println( maxGrade +"학년");
		
		System.out.print("5. 이 동아리 학생들의 가장 많은 학점 ? ");
		int[] scoreCount = {a,b,c,d,f};
		int maxSc = scoreCount[0];
		char maxScore = score[0];
		for (int i = 0; i < scoreCount.length; i++) {
			if(maxSc < scoreCount[i]) {
				scoreCount[i] = maxSc;
			}
			for (int j = 0; j < scoreCount.length; j++) {
				if(i==j) {
					scoreCount[i] = score[j];
				}
			}
		}
		System.out.println(maxScore+"점");
		System.out.println("================================");
		System.out.println("6. 이름을 입력받아 몇번째 인덱스에 있는지 찾아보세요.");
		
		System.out.print("위치를 찾고 싶은 이름 입력 >> ");
		String serName = sc.next();
				
			for (int i = 0; i < name.length; i++) {
				if(serName.equals(name[i])) {
					System.out.print(i+"번째 인덱스");
				}
		}
		System.out.println();
		System.out.println("7. 이름을 입력받아 학년과 학점을 출력해보세요.");
		
		System.out.print("정보를 알고 싶은 이름 입력>>");
		String knowName = sc.next();
		
		for (int i = 0; i < name.length; i++) {
			if(knowName.equals(name[i])) {
				for (int j = 0; j < name.length; j++) {
					if(i==j) {
						System.out.println("입력한 이름의 학년은 : " +grade[j]);
						System.out.print("입력한 이름의 학점은 : " +score[j]);
					}
				}
			}
		}
	}
}
