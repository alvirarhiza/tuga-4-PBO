public class main 
{
    public static void main(String[] args) 
    {
        Team Rrq = new Team("Rrq Roar");

        Anggota orang_1 = new Anggota("Alvira", 20);
        Anggota orang_2 = new Anggota("Aufa", 21);
        Anggota orang_3 = new Anggota("Hibban", 22);

        Anggota orang_4 = new Trainee("Lu'lu'ul Hamdiyah", 25, 24);
        Anggota orang_5 = new Trainee("Fathiyatun Koyimah", 26, 7);
        Anggota orang_6 = new Trainee("Sholahuddin Ridwan", 27, 9);

        Rrq.addAnggota(orang_1);
        Rrq.addAnggota(orang_2);
        Rrq.addAnggota(orang_3);
        Rrq.addAnggota(orang_4);
        Rrq.addAnggota(orang_5);
        Rrq.addAnggota(orang_6);

        Rrq.displayAllMember();
        Rrq.displayAllTraine();
    }
    
}
