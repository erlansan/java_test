/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        String a = "Che";
        System.out.println("Hello fucking World " + a + "!");
        int[] b = new int[10];
        for(int i = 0; i < 10; i++) {
            b[i] = i;
            System.out.println(i);
        }
    }
}
