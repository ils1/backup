package Monsters;

public class Monster_Witch extends SuperMonster{
    public Monster_Witch() {
        setName("Странная Женщина");
        sethp(20);
        setAttack(10);
        setAttackMessage1("Женщина достаёт из под платья Золотой Крест и кидает в вас");
        setAttackMessage2("Ведьма кастует заклинание и вы начинаете гореть");
        setAttackMessage3("У вас перед глазами появляет красная пентаграмма, зрение пропадает на несколько секунд");
    }
}
