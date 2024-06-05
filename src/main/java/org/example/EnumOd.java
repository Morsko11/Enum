package org.example;

public enum EnumOd {
    XXS("44"),
    XS("46"),
    S("48"),
    M("50"),
    L("52"),
    XL("54");
    public String getDescription(){
return str;
    }
    private String str;
   private EnumOd(String str){
       this.str = str;

   }


}
