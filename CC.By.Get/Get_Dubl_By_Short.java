package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Short$Dubl;

public interface Get_Dubl_By_Short extends
	Get_Q_By_Short,
	Get_Dubl_By_Q,
	Short$Dubl
{
	@Lin_Dclar
	double Get_Dubl_By_Short(short By);
		@Override @Nevr_Neds_Ovrid
		default double Short$Dubl(short In)
		{return Get_Dubl_By_Short(In);}
}