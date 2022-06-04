import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClickCounterComponenetComponent } from './click-counter-componenet.component';

describe('ClickCounterComponenetComponent', () => {
  let component: ClickCounterComponenetComponent;
  let fixture: ComponentFixture<ClickCounterComponenetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClickCounterComponenetComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClickCounterComponenetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
