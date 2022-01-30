package Monsters;

public class Monster_DyingKnight extends SuperMonster {
    public Monster_DyingKnight() {
        setName("Умирающий Рыцарь");
        sethp(10);
        setAttack(3);
        setAttackMessage1("Рыцарь плюнул кровью вам в лицо и ударил мечом");
        setAttackMessage2("Рыцарь кинул в вас один из своих окровавленных доспехов");
        setAttackMessage3("Рыцарь пнул вас в грудь со всей силы");
    }
}
