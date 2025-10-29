package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Dubl$Flot;

public interface Get_Flot_By_Dubl extends
	Get_Q_By_Dubl,
	Get_Flot_By_Q,
	Dubl$Flot
{
	@Lin_Dclar
	float Get_Flot_By_Dubl(double By);
		@Override @Nevr_Neds_Ovrid
		default float Dubl$Flot(double In)
		{return Get_Flot_By_Dubl(In);}
}