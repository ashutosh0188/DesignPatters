package factory.ex1;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"[RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU()+"]";
    }
}
