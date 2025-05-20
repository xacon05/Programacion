package tema8;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import jakarta.persistence.*;

@Entity
@SequenceGenerator(name = "evento_seq", sequenceName = "evento_sequence", allocationSize = 10)
public class EventoMusical3 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evento_seq")
    private Long id;

    private String nombre;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private BigDecimal recaudacion;

    @Enumerated(EnumType.STRING)
    private GeneroMusical genero;

    @ElementCollection
    @Embedded
    private List<Artista> artistasConfirmados;

    @Transient
    private int control;

    public EventoMusical3() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public BigDecimal getRecaudacion() { return recaudacion; }
    public void setRecaudacion(BigDecimal recaudacion) { this.recaudacion = recaudacion; }
    public GeneroMusical getGenero() { return genero; }
    public void setGenero(GeneroMusical genero) { this.genero = genero; }
    public List<Artista> getArtistasConfirmados() { return artistasConfirmados; }
    public void setArtistasConfirmados(List<Artista> artistasConfirmados) { this.artistasConfirmados = artistasConfirmados; }
    public int getControl() { return control; }
    public void setControl(int control) { this.control = control; }
}
