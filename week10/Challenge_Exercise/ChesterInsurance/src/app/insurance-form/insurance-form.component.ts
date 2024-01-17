import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { PremiumModalComponent } from '../premium-modal/premium-modal.component';
import { OverlayContainer } from '@angular/cdk/overlay';

@Component({
  selector: 'app-insurance-form',
  templateUrl: './insurance-form.component.html',
  styleUrls: ['./insurance-form.component.scss']
})
export class InsuranceFormComponent {
  vehicleTypes = ['car', 'motorcycle'];
  selectedVehicleType!: string;
  isUnder25: boolean = false;
  penaltyPoints!: number;
  premiumToPay!: number;
  isModalOpen: boolean = false;

  constructor(public dialog: MatDialog,
    private overlayContainer: OverlayContainer) {}

  calculatePremium(): void {
    this.premiumToPay = 0;
    if (this.isModalOpen) {
      return;
    }

    if (this.selectedVehicleType === 'car') {
      this.premiumToPay = 305;
    } else if (this.selectedVehicleType === 'motorcycle') {
      this.premiumToPay = 360;
    } else {
      alert('Invalid vehicle type. Please select "car" or "motorcycle".');
      return;
    }

    if (this.isUnder25) {
      this.premiumToPay += 0.3 * this.premiumToPay;
    }

    if (this.penaltyPoints > 6) {
      this.premiumToPay += 100;
    }

    // alert(`Total premium payable: £${this.premiumToPay.toFixed(2)}`);
    // this.overlayContainer.getContainerElement().classList.add('overlay-container');

    const dialogRef = this.dialog.open(PremiumModalComponent, {
      data: { premium: this.premiumToPay },
      position: { top: '50%', left: '50%' },
      panelClass: 'custom-dialog-container',
    });

    dialogRef.afterOpened().subscribe(() => {
      this.isModalOpen = true;
    });

    dialogRef.afterClosed().subscribe((result) => {
      console.log('The dialog was closed', result);
      window.location.reload();
      // this.overlayContainer.getContainerElement().classList.remove('overlay-container');

    });
  }
}
export { PremiumModalComponent };

