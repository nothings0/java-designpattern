package com.ngoc.chuongtrinh;

import java.util.ArrayList;
import com.ngoc.model.Component;
import com.ngoc.model.File;
import com.ngoc.model.Folder;

public class ChuongTrinh {
    public static void main(String[] args) {
        File Mssql = new File("MS SQL Server file", 500);
        File Pssql = new File("PostgreSQL", 246);
        File Msql = new File("MySQL", 199);
        File Sqlite = new File("SQLite", 10);
        File Ea = new File("EA", 200);
        File Uml = new File("StarUML", 22);
        File Dotnet = new File("dotNET", 199);
        File EC = new File("Eclipse", 15);
        File Msnd = new File("MSND", 15);
        File Loff = new File("Libre Office", 100);
        File Moff = new File("MS Office", 129);

        Folder Dbtool = new Folder("DB tools", 0);
        Folder Ctool = new Folder("Case tools", 0);
        Folder Dvltool = new Folder("Development tools", 0);
        Folder Otool = new Folder("Office tools", 0);

        Dbtool.addFile(Mssql);
        Dbtool.addFile(Pssql);
        Dbtool.addFile(Msql);
        Dbtool.addFile(Sqlite);

        Ctool.addFile(Ea);
        Ctool.addFile(Uml);

        Otool.addFile(Loff);
        Otool.addFile(Moff);

        Dvltool.addFile(Dbtool);
        Dvltool.addFile(Ctool);
        Dvltool.addFile(Msnd);
        Dvltool.addFile(Dotnet);
        Dvltool.addFile(EC);

        // Set initial paths for folders
        Dbtool.setPath("Development tools/DB tools");
        Ctool.setPath("Development tools/Case tools");
        Dvltool.setPath("Development tools");
        Otool.setPath("Office tools");

        var lst = new ArrayList<Component>();
        lst.add(Dvltool);
        lst.add(Otool);

        System.out.println("Folder structure:");
        for (Component x : lst) {
            x.showDetails("");
        }
    }
}
