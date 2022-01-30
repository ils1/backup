package Monsters;

public class Monster_Rat extends SuperMonster{
    public Monster_Rat(){
        setName("Гигантская Крыса");
        sethp(20);
        setAttack(13);
        setAttackMessage1("Крыса кусает вас за ногу");
        setAttackMessage2("Крыса силой мысли лишает вас HP");
        setAttackMessage3("Крыса бьёт вас огромным хвостом по голове");
    }
}
