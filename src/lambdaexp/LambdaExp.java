/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexp;

/**
 *
 * @author katherinelozano
 */

import java.util.function.UnaryOperator;

public class LambdaExp {

    public static void main(String[] args) {

        UnaryOperator<Integer>[] fac = new UnaryOperator[1];
        fac[0] = i -> i == 0 ? 1 : i * fac[0].apply( i - 1);

        UnaryOperator<Integer> factorial = fac[0];

        System.out.println(factorial.apply(6));
    }
}