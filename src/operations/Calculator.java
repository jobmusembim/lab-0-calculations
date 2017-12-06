/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author HP
 */
public class Calculator extends Arithmetic{
    public int sub;

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int getSub() {
        return sub;
    }
    @Override
    public int difference(){
        if (getFirst_number()>getSecond_number()){
            sub=getFirst_number()-getSecond_number();
            return (getFirst_number()-getSecond_number());
        }
    return 0;
    }
    
}
