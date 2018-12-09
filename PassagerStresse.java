package tec;

public class PassagerStresse extends PassagerAbstrait{
	
	public PassagerStresse(String nom , int destination ) {
		super(nom,destination);
	}

	@Override
	public void choixPlaceMontee(Bus b) throws UsagerInvalideException {
		if(b.aPlaceAssise()) {
			b.demanderPlaceAssise(this);
		}
		
	}

	@Override
	public void choixChangerPlace(Bus b, int arret) {

		if(arret >= destination - 3 ) {
			if(b.aPlaceDebout()) {
				b.demanderChangerEnDebout(this);
			}
		}
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
