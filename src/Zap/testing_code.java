package Zap;

public class testing_code {
    private String name;
    private Integer id;


    testing_code(String name,int id){
        this.name =  name;
        this.id = id;

    }

    @Override
    public boolean equals(Object ans){
        if(this==ans) return true;
        if(this==null  && getClass()!=this.getClass()) return false;

        testing_code code = (testing_code) ans;
        return  id == code.id && name.equals(code.name);


    }

    @Override
    public int hashCode(){
        return id+name.hashCode();
    }
}
