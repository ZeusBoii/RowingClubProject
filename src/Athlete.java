public class Athlete extends Member {
    private String awards;

    public Athlete(String fname,String sname,String gender,String email,String phone,int age,int height,String dateregistered, boolean paid, Object experience, String status,String coachName, int coachNum, String awards) {
        super(fname, sname, gender, email, phone, age, height, dateregistered, paid, experience, status, coachName, coachNum);
        this.awards=awards;
    }

    public String getAwards() { return awards; }

    public void setAwards(String awards) { this.awards = awards; }


    public String toString() { return super.toString()+"\nAward: "+ getAwards(); }
}
