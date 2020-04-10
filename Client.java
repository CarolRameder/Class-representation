package com.company;

public class Client {

    private String name;
    private int time;

    public Client(int time) {
        this.time = time;
    }

    public Client(int time,String name){
        this.time = time;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

    /**
     * For checking equality between two clients based on the name and time
     * @param obj - other supposedly client
     * @return if they are equal
     */
    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Client)){
            return false;
        }

        Client other = (Client) obj;
        if(this.name.equals(other.name)){
            return this.time==other.time;
        }

        return false;
    }
}
