package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Dubl1$1;

public interface Get_Dubl_By_Dubl extends
	Get_Q_By_Dubl,
	Get_Dubl_By_Q,
	Dubl1$1
{
	@Lin_Dclar
	double Get_Dubl_By_Dubl(double By);
		@Override
		@Nevr_Neds_Ovrid
		default double Dubl$Dubl(double In){return Get_Dubl_By_Dubl(In);}
}