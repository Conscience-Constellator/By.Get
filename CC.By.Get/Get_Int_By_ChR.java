package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.ChR$Int;

public interface Get_Int_By_ChR extends
	Get_Int_By_Q,
	Get_Q_By_ChR,
	ChR$Int
{
	@Lin_Dclar
	int Get_Int_By_ChR(char By);
		@Override @Nevr_Neds_Ovrid
		default int ChR$Int(char In)
		{return Get_Int_By_ChR(In);}
}