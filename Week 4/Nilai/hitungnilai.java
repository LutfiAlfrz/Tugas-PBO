public class hitungnilai {
    String status, grade;
    String StatusKelulusan(int nilai){
        if(nilai >= 60){
            status = "Lulus";
        }else{
            status = "Tidak Lulus";
        }
        return status;
    }

    String GradeNilai(int nilai){
        if(nilai >= 85){
            grade = "A";
        }else if(nilai < 85 && nilai >= 75){
            grade = "B";
        }
        return grade;
    }
}
