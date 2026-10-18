package com.example.a171026_tsbbmk_repasopm;

public class operaciones {
    private int data1;
    private int data2;
    public void setData1(int data1){
        this.data1 = data1;
    }
    public void setData2(int data2){
        this.data2 = data2;
    }
    public float sum(){
        return this.data1 + this.data2;
    }
    public float rest(){
        return this.data1 - this.data2;
    }
    public float times(){
        return this.data1 * this.data2;
    }
}
