/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;
import java.util.ArrayList;
/**
 *
 * @author MS-USER
 */
public class Polymorphism {

    public static void main(String[] args) {
ArrayList<Pegawai> pegawai = new ArrayList<>();

pegawai.add(new PegawaiTetap("Dimas", "3174836573928487",
200000));
pegawai.add(new PegawaiHarian("Reza", "3176384638468391",
8500, 40));
pegawai.add(new Sales("Mentari", "3174638573927998", 50,
50000));
pegawai.add(new PegawaiTetap("Ical", "3187493756478709",
3000000));
pegawai.add(new PegawaiHarian("Yoga", "3178397483947545",
9000, 45));
pegawai.add(new Sales("Selena", "3173839576448003", 55,
55000));
pegawai.add(new PegawaiTetap("Marin", "3189446385774199",
4000000));
pegawai.add(new PegawaiHarian("Adam", "3173859375638367",
9500, 50));
pegawai.add(new Sales("Saput", "3173944738558371", 60,
60000));
for (int i = 0; i < pegawai.size(); i++){ System.out.println(pegawai.get(i).toString());
}
}

}

