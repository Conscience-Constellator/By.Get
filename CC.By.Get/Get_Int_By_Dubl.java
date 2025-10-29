package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Dubl$Int;

public interface Get_Int_By_Dubl extends
	Get_Q_By_Dubl,
	Get_Int_By_Q,
	Dubl$Int
{
	@Lin_Dclar
	int Get_Int_By_Dubl(double By);
		@Override @Nevr_Neds_Ovrid
		default int Dubl$Int(double In)
		{return Get_Int_By_Dubl(In);}
}