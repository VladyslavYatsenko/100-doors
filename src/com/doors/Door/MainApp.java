package com.doors.Door;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Door> doors = new ArrayList<>();
        for (int i = 0; i < 100; i++) {//init doors
            doors.add(new Door());
        }
        System.out.println(doors);
        int step=1;//Шаг
        while (step<100){
            System.out.println("------------------- Step<-"+(step));
            for(int i=step-1;i<100;i+=step){
                if(doors.get(i).getStatus()==false){
                    doors.get(i).open();
                    System.out.println("Door " +(i+1) +"was changed");
                }else {
                    doors.get(i).close();
                    System.out.println("Door " +(i+1) +"was changed");
                }
            }
            System.out.println(doors);
            step++;
        }
        System.out.println("Final doors" +doors);
        for(int i=0;i<100;i++){
            if(doors.get(i).getStatus()==false){
                System.out.println("Door ("+(i+1)+")"+"is closed");
            }else {
                System.out.println("Door ("+(i+1)+")"+"is opened");
            }
        }

    }
}
