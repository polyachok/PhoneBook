package ru.phonebook.gui.worker;

import ru.phonebook.gui.interfaces.WorkerInterface;

public class BaseWorker implements WorkerInterface {

    private String post;
    private String fname;
    private String thname;
    private int phonenumber;
    private  String email;



    @Override
    public String getFName() {
        return fname;
    }

    @Override
    public String getTHName() {
        return thname;
    }

    @Override
    public void setFname() {

    }

    @Override
    public void setTHName() {

    }

    @Override
    public int getPhoneNum() {
        return phonenumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setPhoneNum() {

    }

    @Override
    public void setEmail() {

    }
}
