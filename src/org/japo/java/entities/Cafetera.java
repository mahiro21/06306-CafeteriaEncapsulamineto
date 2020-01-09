/* 
 * Copyright 2020 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
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
package org.japo.java.entities;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class Cafetera {

    //Constantes
    public static final int CAFE = 0;
    public static final int TE = 1;
    public static final int BATIDO = 2;
    public static final int CON_AZUCAR = 4;
    public static final int SIN_AZUCAR = 8;
  
    //Valor de prueba
    public static final int DEF_SERVICIO = CAFE + SIN_AZUCAR;

    //Variables
    private  int servicio;

    //Constructores
    public Cafetera() {
        servicio = DEF_SERVICIO;
    }
    
    public Cafetera(int servicio) {
        this.servicio = servicio;
    }

    //Acessores
    public final int getServicio() {
        return servicio;
    }

    public final void setServicio(int servicio) {
        if (servicio == CAFE || servicio == CAFE + CON_AZUCAR
                || servicio == CAFE + SIN_AZUCAR
                || servicio == TE
                || servicio == TE + CON_AZUCAR
                || servicio == TE + SIN_AZUCAR
                || servicio == BATIDO) {
            this.servicio = servicio;
        }
    }

}
