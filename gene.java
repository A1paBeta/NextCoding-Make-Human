// 1. 클래스명 : Gene (유전자)
// 2. 내부 데이터
//  - mGenderChromosome_1(성염색체 1번), short형, 1 : X 염색체, 2 : Y 염색체
//  - mGenderChromosome_2(성염색체 2번), short형, 1 : X 염색체, 2 : Y 염색체
//  - mExpectHeight(기대 키 높이), short형

// 3. 내부 메소드
//  - public Gene(short genderChromosome_1, short genderChromosome_2, short expectHeight) : 생성자, 각 매개변수를 멤버변수에 대입
//  - public String getGender(), 반환 값 : 남자면 "Male", 여자면 "Female"
//  - public float getRealHeight(), 반환 값 : {기대 키 높이 - (기대 키 높이 * 0.1)}

public class Gene {

    private short mGenderChromosome_1, mGenderChromosome_2, mExpectHeight;

    public Gene(short genderChromosome_1, short genderChromosome_2, short expectHeight){
        this.mGenderChromosome_1 = genderChromosome_1;
        this.mGenderChromosome_2 = genderChromosome_2;
    }

    public String getGender(){
        if(this.mGenderChromosome_1 == 1 && this.mGenderChromosome_2 == 2){
            return "Male";
        }else if(this.mGenderChromosome_1 == 1 && this.mGenderChromosome_2 == 1) {
            return "Female";
        }else if(this.mGenderChromosome_1 == 2 && this.mGenderChromosome_2 == 1){
            return "Male";
        }

        return "Strange";
    }

    public float getRealHeight(){
        return this.mExpectHeight - (this.mExpectHeight * 0.1f);
    }
    
}
