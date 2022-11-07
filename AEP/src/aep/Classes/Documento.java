
package aep.Classes;

import java.io.File;

public class Documento {
    private File fotoDocFrente;
    private File fotoDocVerso;
    private File fotoCompResidencia;

    
    public Documento(File fotoDocFrente, File fotoDocVerso, File fotoCompResidencia) {
        this.fotoDocFrente = fotoDocFrente;
        this.fotoDocVerso = fotoDocVerso;
        this.fotoCompResidencia = fotoCompResidencia;
    }

    public Documento() {
        
    }
    
     
    public File getFotoDocFrente() {
        return fotoDocFrente;
    }

    public void setFotoDocFrente(File fotoDocFrente) {
        this.fotoDocFrente = fotoDocFrente;
    }

    public File getFotoDocVerso() {
        return fotoDocVerso;
    }

    public void setFotoDocVerso(File fotoDocVerso) {
        this.fotoDocVerso = fotoDocVerso;
    }

    public File getFotoCompResidencia() {
        return fotoCompResidencia;
    }

    public void setFotoCompResidencia(File fotoCompResidencia) {
        this.fotoCompResidencia = fotoCompResidencia;
    }

   

    
    
}
