package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Flot$Int;

public interface Get_Int_By_Flot extends
	Get_Q_By_Flot,
	Get_Int_By_Q,
	Flot$Int
{
	@Lin_Dclar
	int Get_Int_By_Flot(float By);
		@Override @Nevr_Neds_Ovrid
		default int Flot$Int(float In)
		{return Get_Int_By_Flot(In);}
}