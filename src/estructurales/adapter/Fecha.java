package estructurales.adapter;
//Interface para manejar fechas en ES (DD/MM/AAAA)

interface Fecha {

	@Override
	public String toString();

	public int getAnio();

	public void setAnio(int anio);

	public int getDia();

	public void setDia(int dia);

	public int getMes();

	public void setMes(int mes);
}
