package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Int1$1;

public interface Get_Int_By_Int extends
	Get_Q_By_Int,
	Get_Int_By_Q,
	Int1$1
{
	@Lin_Dclar
	int Get_Int_By_Int(int By);
		@Override
		@Nevr_Neds_Ovrid
		default int Int1$1(int In){return Get_Int_By_Int(In);}
}