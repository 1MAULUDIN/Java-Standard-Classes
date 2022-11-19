/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectsClass;

import java.util.Objects;

/**
 *
 * @author GIE
 */
public class ObjectsApp {
    public static class Data {
        private String data;

        @Override
        public String toString() {
            return "Data{" + "data=" + data + '}';
        }

        public Data(String data) {
            this.data = data;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 37 * hash + Objects.hashCode(this.data);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Data other = (Data) obj;
            if (!Objects.equals(this.data, other.data)) {
                return false;
            }
            return true;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        execute(new Data("Egi")); 
    }
    public static void execute(Data data) {
        
            System.out.println(Objects.toString(data));
            System.out.println(Objects.hashCode(data));
        
    }
} 
 