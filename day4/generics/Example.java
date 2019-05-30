public class Example<T,G>{
    T variableT;
    G variableG;
    public Example(T variableT, G variableG){
        this.variableT= variableT;
        this.variableG=variableG;

    }
    public String toString(){
        return "The input variable is :"+variableT+" And the second variable is "+variableG;

    }

}