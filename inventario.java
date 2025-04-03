package pinguino;

public class inventario {
private ArrayList<BolasDeNieve> bolasdenieve;
private ArrayList<Pescado> pescado;

	    public Inventario() {
	        this.equipamiento = new ArrayList<>();
	    }

	    public void agregarEquipamiento(Equipamiento equipamiento) {
	        this.equipamiento.add(equipamiento);
	    }

	    public void mostrarInventario() {
	        System.out.println("Inventario:");
	        for (Equipamiento e : equipamiento) {
	            System.out.println(e.getNombre() + " - " + e.getTipo());
	        }
	}
}
