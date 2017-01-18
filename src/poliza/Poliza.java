/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliza;

/**
 *
 * @author a022583952e
 */
public class Poliza {

    /**
     * @param args the command line arguments
     */
    private String polizaTipo;
    private int id;

    public String getPolizaTipo() {
        return polizaTipo;
    }

    public void setPolizaTipo(String polizaTipo) {
        this.polizaTipo = polizaTipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Poliza(String polizaTipo, int id) {
        this.polizaTipo = polizaTipo;
        this.id = id;
    }
    
}
