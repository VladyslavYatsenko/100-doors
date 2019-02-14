package com.doors.Door;

public class Door {
    private boolean status=false;
    @Override
    public String toString() {
        return "Door status -> "+status;
    }
    public void open(){
        status=true;
    }
    public void close(){
        status=false;
    }
    public boolean getStatus(){
        return status;
    }
}
