public class Data implements Comparable<Data>{
    private final int value;

    public Data(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Data value) {
        return this.getValue()-value.getValue();
    }
/*
    public int getX(){
        return this.value[0];
    }

    public int getY(){
        return this.value[0];
    }*/
}
