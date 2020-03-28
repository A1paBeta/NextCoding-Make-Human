public class Main {

    public static void main(String[] args){
        Human mYongHyun = new Human("이용현");

        System.out.println("이 사람의 이름은 " + mYongHyun.getName() + "입니다.");
        mYongHyun.showInfo();

        boolean isYouHongildongRes = mYongHyun.isYouHongilDong();
        if(isYouHongildongRes == true){
            System.out.println("이 사람은 홍길동입니다.");
        }else {
            System.out.println("이 사람은 홍길동이 아닙니다.");
        }
    }

}
