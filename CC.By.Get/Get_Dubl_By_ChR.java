package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.ChR$Dubl;

public interface Get_Dubl_By_ChR extends
	Get_Q_By_ChR,
	Get_Dubl_By_Q,
	ChR$Dubl
{
	@Lin_Dclar
	double Get_Dubl_By_ChR(char By);
		@Override @Nevr_Neds_Ovrid
		default double ChR$Dubl(char In)
		{return Get_Dubl_By_ChR(In);}
}