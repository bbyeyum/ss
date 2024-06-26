package kr.s07.object.method;
/*
 * [실습]
 * Worker
 * 1) 멤버 변수: 직원 이름(name), 급여(money), 계좌 잔고(balance)
 * 2) 멤버 메서드: work(실행하면 money에 1000원 누적)
 * 				deposite(실행하면 money에 저장된 돈을 balance에 누적시키고 money는 0처리)
 * WorkerMain의 main
 * 1) Worker 객체 생성
 * 2) 직원의 이름 지정
 * 3) 10번 일하는데 번 돈이 3000원일 때마다 계좌에 저축
 * 4) 직원 이름, 현재 계좌에 입금되지 않고 남아있는 급여(money), 계좌 잔고(balance)를 출력하시오.
 */



class Worker{
	String name;
	int money;
	int balance;
	
	public void work() {
		money += 1000;
	}
	
	public void deposite() {
		balance += money;    //내가 가지고 있는 돈을 은행에 저축했을 때 코드 (돈이 옮겨지는)
		money = 0;
	}
}

public class WorkerMain {
	public static void main(String[] args) {
		Worker x = new Worker();
		x.name = "홍길동";
		
		for(int i = 1; i <=10; i++) {
			x.work();
			if(x.money == 3000) {
				x.deposite();
			}
		}
		System.out.println("직원이름: " + x.name);
		System.out.printf("현재 계좌에 입금되지 않고 남아있는 급여: %,d원%n" , x.money);
		System.out.printf("계좌 잔고: %,d원", x.balance);
	}
}
