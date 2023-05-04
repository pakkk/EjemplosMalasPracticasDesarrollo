package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio3.problema;

public class inmueble implements Comparable<inmueble>{

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public int compareTo(inmueble o) {
		return 0;
	}

	/**
	 * @return the idEntificadoR
	 */
	String getIdEntificadoR() {
		return IdEntificadoR;
	}

	/**
	 * @return the numeroDeDormitorios
	 */
	protected Integer getNumeroDeDormitorios() {
		return NumeroDeDormitorios;
	}

	/**
	 * @return the aLTA_ELECTRICIDAD
	 */
	private Boolean getALTA_ELECTRICIDAD() {
		return ALTA_ELECTRICIDAD;
	}

	/**
	 * @return the altaAGUA
	 */
	boolean isAltaAGUA() {
		return altaAGUA;
	}

	/**
	 * @return the pisoNumeroDE_Planta
	 */
	protected Integer getPisoNumeroDE_Planta() {
		return pisoNumeroDE_Planta;
	}

	/**
	 * @return the pISO_numeroDeVecinosUrbanización
	 */
	private Integer getPISO_numeroDeVecinosUrbanización() {
		return PISO_numeroDeVecinosUrbanización;
	}

	/**
	 * @return the chaléConPiscina
	 */
	Boolean getChaléConPiscina() {
		return chaléConPiscina;
	}

	/**
	 * @return the chalÉConZonasVERDES
	 */
	protected Boolean getChalÉConZonasVERDES() {
		return chalÉConZonasVERDES;
	}

	/**
	 * @param idEntificadoR the idEntificadoR to set
	 */
	private void setIdEntificadoR(String idEntificadoR) {
		IdEntificadoR = idEntificadoR;
	}

	/**
	 * @param numeroDeDormitorios the numeroDeDormitorios to set
	 */
	void setNumeroDeDormitorios(Integer numeroDeDormitorios) {
		NumeroDeDormitorios = numeroDeDormitorios;
	}

	/**
	 * @param aLTA_ELECTRICIDAD the aLTA_ELECTRICIDAD to set
	 */
	protected void setALTA_ELECTRICIDAD(Boolean aLTA_ELECTRICIDAD) {
		ALTA_ELECTRICIDAD = aLTA_ELECTRICIDAD;
	}

	/**
	 * @param altaAGUA the altaAGUA to set
	 */
	private void setAltaAGUA(boolean altaAGUA) {
		this.altaAGUA = altaAGUA;
	}

	/**
	 * @param pisoNumeroDE_Planta the pisoNumeroDE_Planta to set
	 */
	void setPisoNumeroDE_Planta(Integer pisoNumeroDE_Planta) {
		this.pisoNumeroDE_Planta = pisoNumeroDE_Planta;
	}

	/**
	 * @param pISO_numeroDeVecinosUrbanización the pISO_numeroDeVecinosUrbanización to set
	 */
	protected void setPISO_numeroDeVecinosUrbanización(Integer pISO_numeroDeVecinosUrbanización) {
		PISO_numeroDeVecinosUrbanización = pISO_numeroDeVecinosUrbanización;
	}

	/**
	 * @param chaléConPiscina the chaléConPiscina to set
	 */
	private void setChaléConPiscina(Boolean chaléConPiscina) {
		this.chaléConPiscina = chaléConPiscina;
	}

	/**
	 * @param chalÉConZonasVERDES the chalÉConZonasVERDES to set
	 */
	void setChalÉConZonasVERDES(Boolean chalÉConZonasVERDES) {
		this.chalÉConZonasVERDES = chalÉConZonasVERDES;
	}

	private inmueble(String idEntificadoR, Integer numeroDeDormitorios, Boolean aLTA_ELECTRICIDAD, boolean altaAGUA) {
		IdEntificadoR = idEntificadoR;
		NumeroDeDormitorios = numeroDeDormitorios;
		ALTA_ELECTRICIDAD = aLTA_ELECTRICIDAD;
		this.altaAGUA = altaAGUA;
	}
	
	protected inmueble(String idEntificadoR, Integer numeroDeDormitorios, Boolean aLTA_ELECTRICIDAD, boolean altaAGUA,
			Integer pisoNumeroDE_Planta, Integer pISO_numeroDeVecinosUrbanización) {
		IdEntificadoR = idEntificadoR;
		NumeroDeDormitorios = numeroDeDormitorios;
		ALTA_ELECTRICIDAD = aLTA_ELECTRICIDAD;
		this.altaAGUA = altaAGUA;
		this.pisoNumeroDE_Planta = pisoNumeroDE_Planta;
		PISO_numeroDeVecinosUrbanización = pISO_numeroDeVecinosUrbanización;
	}

	inmueble(String idEntificadoR, Integer numeroDeDormitorios, Boolean aLTA_ELECTRICIDAD, boolean altaAGUA,
			Boolean chaléConPiscina, Boolean chalÉConZonasVERDES) {
		IdEntificadoR = idEntificadoR;
		NumeroDeDormitorios = numeroDeDormitorios;
		ALTA_ELECTRICIDAD = aLTA_ELECTRICIDAD;
		this.altaAGUA = altaAGUA;
		this.chaléConPiscina = chaléConPiscina;
		this.chalÉConZonasVERDES = chalÉConZonasVERDES;
	}

	public String IdEntificadoR ;
	private Integer NumeroDeDormitorios ;
	protected Boolean ALTA_ELECTRICIDAD ;
	protected boolean altaAGUA ;
	public Integer pisoNumeroDE_Planta ;
	public Integer PISO_numeroDeVecinosUrbanización ;
	private Boolean chaléConPiscina ;
	private Boolean chalÉConZonasVERDES ;
	
	@Override
	public String toString() {
		return "inmueble [IdEntificadoR=" + IdEntificadoR + ", NumeroDeDormitorios=" + NumeroDeDormitorios
				+ ", ALTA_ELECTRICIDAD=" + ALTA_ELECTRICIDAD + ", altaAGUA=" + altaAGUA + ", pisoNumeroDE_Planta="
				+ pisoNumeroDE_Planta + ", PISO_numeroDeVecinosUrbanización=" + PISO_numeroDeVecinosUrbanización
				+ ", chaléConPiscina=" + chaléConPiscina + ", chalÉConZonasVERDES=" + chalÉConZonasVERDES + "]";
	}	
}
