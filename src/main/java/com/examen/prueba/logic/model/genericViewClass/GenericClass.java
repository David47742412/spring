package com.examen.prueba.logic.model.genericViewClass;

public class GenericClass {

    private Object identificador;

    private Object value1;

    private Object value2;

    private Object value3;

    private Object value4;

    private Object value5;

    private Object value6;

    public GenericClass() {

    }

    public GenericClass(Object identificador, Object value1, Object value2, Object value3, Object value4, Object value5, Object value6) {
        this.setIdentificador(identificador);
        this.setValue1(value1);
        this.setValue2(value2);
        this.setValue3(value3);
        this.setValue4(value4);
        this.setValue5(value5);
        this.setValue6(value6);
    }

    public Object getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Object identificador) {
        this.identificador = identificador;
    }

    public Object getValue1() {
        return value1;
    }

    public void setValue1(Object value1) {
        this.value1 = value1;
    }

    public Object getValue2() {
        return value2;
    }

    public void setValue2(Object value2) {
        this.value2 = value2;
    }

    public Object getValue3() {
        return value3;
    }

    public void setValue3(Object value3) {
        this.value3 = value3;
    }

    public Object getValue4() {
        return value4;
    }

    public void setValue4(Object value4) {
        this.value4 = value4;
    }

    public Object getValue5() {
        return value5;
    }

    public void setValue5(Object value5) {
        this.value5 = value5;
    }

    public Object getValue6() {
        return value6;
    }

    public void setValue6(Object value6) {
        this.value6 = value6;
    }
}
