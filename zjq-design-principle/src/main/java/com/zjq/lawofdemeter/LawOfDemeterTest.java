package com.zjq.lawofdemeter;

/**
 * Created by zjq 迪米特原则
 */
public class LawOfDemeterTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }

}
