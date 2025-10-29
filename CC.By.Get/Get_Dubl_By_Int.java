package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Int$Dubl;

public interface Get_Dubl_By_Int extends
	Get_Q_By_Int,
	Get_Dubl_By_Q,
	Int$Dubl
{
	@Lin_Dclar
	double Get_Dubl_By_Int(int By);
		@Override @Nevr_Neds_Ovrid
		default double Int$Dubl(int In)
		{return Get_Dubl_By_Int(In);}
}