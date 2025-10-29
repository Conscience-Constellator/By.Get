package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Flot$Dubl;

public interface Get_Dubl_By_Flot extends
	Get_Q_By_Flot,
	Get_Dubl_By_Q,
	Flot$Dubl
{
	@Lin_Dclar
	double Get_Dubl_By_Flot(float By);
		@Override @Nevr_Neds_Ovrid
		default double Flot$Dubl(float In)
		{return Get_Dubl_By_Flot(In);}
}