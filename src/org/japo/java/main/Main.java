/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        try {
            System.out.println("Distancia entre Horas");
            System.out.println("=====================");

            System.out.print("Hora inicio ......: ");
            int hEnt = SCN.nextInt();
            SCN.nextLine();
            System.out.print("Minuto inicio ....: ");
            int mEnt = SCN.nextInt();
            SCN.nextLine();
            System.out.print("Segundo inicio ...: ");
            int sEnt = SCN.nextInt();
            SCN.nextLine();

            System.out.println("---");

            int hAct = cal.get(Calendar.HOUR_OF_DAY);
            int mAct = cal.get(Calendar.MINUTE);
            int sAct = cal.get(Calendar.SECOND);

            //Tiempos en segundos
            int tiempoEnt = hEnt * 3600 + mEnt * 60 + sEnt;
            int tiempoAct = hAct * 3600 + mAct * 60 + sAct;

            //Segundos
            int sDis = tiempoAct - tiempoEnt;

            //Minutos
            int mDis = sDis / 60;

            //Horas
            int hDis = mDis / 60;
            mDis = mDis % 60;
            sDis = sDis % 60;

            System.out.printf("%s%02d:%02d:%02d%n", "Hora actual ......: ", hAct, mAct, sAct);
            System.out.printf("%s%02d:%02d:%02d%n", "Hora inicio ......: ", hEnt, mEnt, sEnt);
            System.out.printf("%s%02d:%02d:%02d%n", "Tiempo de clase ..: ", hDis, mDis, sDis);

        } catch (Exception e) {
            System.out.println("Error: Entrada incorrecta");
        }

    }
}
