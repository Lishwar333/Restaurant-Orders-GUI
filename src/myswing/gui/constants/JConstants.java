package myswing.gui.constants;

public class JConstants {

	String HOME_WELCOME_LABEL = "<html><div style='text-align:center;'>Welcome to Los Pollos Hermanos!<br>Enter your name, then tap the button below to choose your order!</div></html>";
	String ORDERS_PAGE_HEADING = "Please select your orders";		
	String AD_MAIN_PANEL_TITLE = "<html><div style='text-align:center;'>Advertisement!<br>Lavandería Brillante — Donde la Ropa Brilla Como Nueva</div></html>";
	String ADV_CONTENT = "<html><div style='text-align:center; font-family:Arial; color:black;'>"
		    + "<h2 style='font-weight:bold; margin-bottom:5px;'>Lavandería Brillante</h2>"
		    + "<p>Donde tu ropa <b>brilla como nueva</b></p>"
		    + "<p>"
		    + "✔ Lavado ecológico y desinfección total<br>"
		    + "✔ Secado rápido con tecnología de ahorro energético<br>"
		    + "✔ Planchado profesional sin arrugas<br>"
		    + "✔ Servicio de recogida y entrega a domicilio"
		    + "</p>"
		    + "<p>Haz clic en el botón de abajo para conocer más servicios</p>"
		    + "<p><a href='https://breakingbad.fandom.com/wiki/Lavander%C3%ADa_Brillante'>"
		    + "Más información sobre Lavandería Brillante</a></p>"
		    + "</div></html>";
	String PAYMENT_TITLE = "You are in Payment Page!";
	
	public String getPAYMENT_TITLE() {
		return PAYMENT_TITLE;
	}

	public void setPAYMENT_TITLE(String pAYMENT_TITLE) {
		PAYMENT_TITLE = pAYMENT_TITLE;
	}

	public String getADV_CONTENT() {
		return ADV_CONTENT;
	}

	public void setADV_CONTENT(String aDV_CONTENT) {
		ADV_CONTENT = aDV_CONTENT;
	}

	public String getAD_MAIN_PANEL_TITLE() {
		return AD_MAIN_PANEL_TITLE;
	}

	public void setAD_MAIN_PANEL_TITLE(String aD_MAIN_PANEL_TITLE) {
		AD_MAIN_PANEL_TITLE = aD_MAIN_PANEL_TITLE;
	}

	public String getORDERS_PAGE_HEADING() {
		return ORDERS_PAGE_HEADING;
	}

	public void setORDERS_PAGE_HEADING(String oRDERS_PAGE_HEADING) {
		ORDERS_PAGE_HEADING = oRDERS_PAGE_HEADING;
	}

	public String getHOME_WELCOME_LABEL() {
		return HOME_WELCOME_LABEL;
	}

	public void setHOME_WELCOME_LABEL(String hOME_WELCOME_LABEL) {
		HOME_WELCOME_LABEL = hOME_WELCOME_LABEL;
	}

}
